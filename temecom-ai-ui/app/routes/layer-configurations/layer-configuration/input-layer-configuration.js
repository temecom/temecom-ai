import Route from '@ember/routing/route';
import {hash as rsvpHash}  from 'rsvp';
import LayerConfiguration from '../layer-configuration';
export default LayerConfiguration.extend({
	model: function(parameters) {
		return rsvpHash({
			layerConfiguration: this.store.findRecord('inputLayerConfiguration', parameters.id),
		})
		.then(function(model){
			return model;
		});
	},
	setupController: function(controller,model) {
		this._super(controller,model);
	}
		
});
 