import Route from '@ember/routing/route';
import {hash as rsvpHash}  from 'rsvp';
export default Route.extend({
	model: function(parameters) {
		return rsvpHash({
			layerConfiguration: this.store.findRecord('outputlayerConfiguration', parameters.id),
			layerTypes: this.store.findAll('layerType'), 
			activations: this.store.findAll('activation'),
			weightInitializations: this.store.findAll('weightInit')
		})
		.then(function(model){
			return model;
		});
	}
});
 