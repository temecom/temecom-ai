import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
		saveConfiguration: function() {
			var configuration = this.model.networkConfiguration; 
			configuration.save();
		},

		weightInitSelected: function(id) {
			this.setSelection('weightInit', id)
		},
		activationSelected: function(id) {
			this.setSelection('activation', id)
		},
		updaterSelected: function(id) {
			this.setSelection('updater', id)
		}
	}, 
	
	setSelection: function(property, id) {
		var record= this.store.peekRecord(property, id);
		this.model.networkConfiguration.set(property, record);
	}
});
