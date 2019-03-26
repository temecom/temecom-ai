import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
		saveConfiguration: function() {
			var configuration = this.model.networkConfiguration; 
			configuration.save();
		},

		weightInitSelected: function(weightInit) {
			this.setSelection('weightInit', weightInit);
		},
		activationSelected: function(activation) {
			this.setSelection('activation', activation);
		},
		updaterSelected: function(updater) {
			this.setSelection('updater', updater);
		}, 
		optimizationAlgorithmSelected: function(optimizationAlgorithm) {
			this.setSelection('optimizationAlgorithm', optimizationAlgorithm);
		},
		addLayerConfiguration: function(layer) {
			var configuration = this.model.networkConfiguration;
			configuration.get('layers').pushObject(layer);
		}
	}, 
	
	setSelection: function(property, id) {
		var record= this.store.peekRecord(property, id);
		this.model.networkConfiguration.set(property, record);
	}
});
