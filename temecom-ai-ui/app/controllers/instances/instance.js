import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
		saveInstance: function() {
			var configuration = this.model.instance; 
			configuration.save();
		},

		instanceStatusSelected: function(id) {
			this.setSelection('instanceStatus', id);
		},
		networkConfigurationSelected: function(id) {
			this.setSelection('networkConfiguration', id);
		},
		addLayer: function(layer) {
			var configuration = this.model.instance;
			configuration.get(layers).push(layer);
		}
	}, 
	
	setSelection: function(property, id) {
		var record= this.store.peekRecord(property, id);
		this.model.instance.set(property, record);
	}
});
