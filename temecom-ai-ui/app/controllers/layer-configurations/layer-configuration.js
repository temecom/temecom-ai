import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
	
		weightInitializationSelected: function(weightInitialization) {
			this.set('model.layerConfiguration.weightInitialization', weightInitialization);
		},
		activationSelected: function(activation) {
			var layerConfiguration = this.get('model.layerConfiguration'); 
			layerConfiguration.set('activation', activation);			
		}, 
		
		layerTypeSelected: function(layerType) {
			this.set('model.layerConfiguration.layerType', layerType);
		}, 
		saveLayer: function() {
			this.get('model').layerConfiguration.save();
		}
	},
	setLayerConfiguration: function(layerConfiguration) {
		this.get('model').layerConfiguration=layerConfiguration;
	}
});
