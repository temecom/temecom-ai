import Route from '@ember/routing/route';

export default Route.extend({
	model: function(parameters) {
		return Ember.RSVP.hash({
			networkConfiguration: this.store.findRecord('networkConfiguration', parameters.id),
			weightInitializations: this.store.findAll('weight-init'),
			activations: this.store.findAll('activation'),
			updaters: this.store.findAll('updater')
		});
	}
});
