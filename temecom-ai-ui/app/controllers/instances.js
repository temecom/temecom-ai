import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
		newInstance: function() {
			var self = this; 
			var configuration = this.get('store').createRecord('instance', {name: "New Instance"});
			configuration.save()
			.then(function(configuration){
				self.transitionToRoute("instances.instance", configuration);
			});
		}, 
		instanceSelected: function(instance) {
			this.transitionToRoute('instances.instance', instance);
		}
	}
});
