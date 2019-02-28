import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
		saveLayer: function() {
			this.get('model.layerConfiguration').save();
		},
		weightInitializationSelected: function(weightInitialization) {
			this.get('model.layerConfiguration').set('weightInitialization', weightInitialization);
		},
		activationSelected: function(activation) {
			this.get('model.layerConfiguration').set('activation', activation);			
		}, 
		
		layerTypeSelected: function(layerType) {
			this.get('model.layerConfiguration').set('layerType', layerType);
		}
	}
});