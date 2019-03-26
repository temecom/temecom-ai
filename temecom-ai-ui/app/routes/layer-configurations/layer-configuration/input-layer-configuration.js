import {hash as rsvpHash}  from 'rsvp';
import LayerConfiguration from '../layer-configuration';
export default LayerConfiguration.extend({
	model: function(parameters) {
		var self = this;
		return this._super()
			.then(function(model){		
				model.layerConfiguration = self.store.findRecord('inputLayerConfiguration', parameters.id);
				return rsvpHash(model);
			}) 
			.then(function(model){		
				return model;
			});
	},
	setupController: function(controller,model) {
		this._super(controller,model);
	}
		
});
 