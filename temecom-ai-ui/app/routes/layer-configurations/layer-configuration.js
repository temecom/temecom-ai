import Route from '@ember/routing/route';
import Ember from 'ember';
export default Route.extend({
	model: function(parameters) {
		return Ember.RSVP.hash({
			layerConfiguration: this.store.findRecord('layerConfiguration', parameters.id),
			layerTypes: this.store.findAll('layerType'), 
			activations: this.store.findAll('activation'),
			weightInitializations: this.store.findAll('weightInit')
		});
	}
});
