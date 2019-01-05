define(function(require) {
	var initializing = false, 
		fnTest = /xyz/.test(function(){xyz;}) ? /\$super/ : /.*/ ;

	var kclass = function() {};
	kclass.extend = function(propertys) {
		var _super = this.prototype;
		initializing = true;
		var prototype = new this();
		initializing = false;
		for(var name in propertys) {
			if( typeof propertys[name] == 'function'
			    && typeof _super[name] == 'function'
			    && fnTest.test(propertys[name])) {
				prototype[name] = 
				(function(name, fn) {
					return function() {
						var tmp = this.$super;
						this.$super = _super[name];
						var result = propertys[name].apply(this, arguments);
						this.$super = tmp;
						return result;
					};
				}(name, propertys[name]));
			}
			else if(typeof propertys[name] == 'function' && fnTest.test(propertys[name])) {
				prototype[name] = 
				(function(name, fn) {
					return function() {
						delete this.$super;
						fn.apply(this, arguments);
					};
				}(name, propertys[name]));
			}
			else {
				prototype[name] = propertys[name];
			}
		}
		function Class() {
			if(!initializing && this.initialize && typeof this.initialize == 'function') {
				this.initialize.apply(this, arguments);
			}
		};
		Class.extend = arguments.callee;
		Class.prototype = prototype;
		Class.prototype.constructor = Class;
		return Class;
	};
	return kclass;
});

