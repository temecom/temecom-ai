import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
		saveInstance: function() {
			var instance = this.get('model.instance'); 
			instance.save();
		},

		instanceStatusSelected: function(status) {
			this.setSelection('instanceStatus', status);
		},
		networkConfigurationSelected: function(networkConfiguration) {
			this.setSelection('networkConfiguration', networkConfiguration);
		},
		addLayer: function(layer) {
			var configuration = this.model.instance;
			configuration.get('layers').push(layer);
		}
	}, 
	
	setSelection: function(property, value) {
		this.model.instance.set(property, value);
	}
});
