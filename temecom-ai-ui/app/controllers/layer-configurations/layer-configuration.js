import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
	
		weightInitializationSelected: function(weightInitialization) {
			this.get('model').set('weightInitialization', weightInitialization);
		},
		activationSelected: function(activation) {
			this.get('model').set('activation', activation);			
		}, 
		
		layerTypeSelected: function(layerType) {
			this.get('model').set('layerType', layerType);
		}
	},
	addLayerConfiguration: function(layerConfiguration) {
		this.get('model').layerConfiguration=layerConfiguration;
	}
});
