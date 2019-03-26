import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
		newConfiguration: function() {
			var self = this; 
			var configuration = this.get('store').createRecord('networkConfiguration', {name: "New Configuration"});
			configuration.save()
			.then(function(configuration){
				self.transitionToRoute("network-configurations.network-configuration", configuration);
			});
		},
		configurationSelected: function(configuration) {
			this.transitionToRoute('network-configurations.network-configuration', configuration);
		}
	}
});
