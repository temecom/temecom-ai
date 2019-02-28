import Route from '@ember/routing/route';
import {hash as rsvpHash}  from 'rsvp';
export default Route.extend({
	model: function(parameters) {
		return rsvpHash({
			layerConfiguration: this.store.findRecord('inputLayerConfiguration', parameters.id)
		})
		.then(function(model){
			return model;
		});
	},
	setupController: function(controller,model) {
		controller.setLayerConfiguration(model.layerConfiguration);
	}
		
});
 