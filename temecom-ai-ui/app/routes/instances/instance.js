import Route from '@ember/routing/route';

export default Route.extend({
	model: function(parameter) {
		return Ember.RSVP.hash ({
			instance: this.store.findRecord('instance', parameter.id),
			networkConfigurations: this.store.findAll('networkConfiguration'),
			instanceStatuses: this.store.findAll('instanceStatus')
		});
	}
});
