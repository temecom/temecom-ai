import DS from 'ember-data';

export default DS.JSONSerializer.extend({
	   serialize: function(record, options) {
	        options = options ? options : {}; // handle the case where options is undefined
	        options.includeId = true;
	        return this._super.apply(this, [record, options]); // Call the parent serializer
	    }
});
