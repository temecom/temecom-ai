import DS from 'ember-data';
import Ember from 'ember';
import { pluralize } from 'ember-inflector';

export default DS.RESTAdapter.extend({
	pathForType : function(modelName) {
		var camelized = Ember.String.camelize(modelName);
		return pluralize(camelized);
	},
	methodForRequest ({requestType}) {
		if (requestType === "updateRecord") {
			return "PUT";
		}

		return this._super(...arguments);
	}
});