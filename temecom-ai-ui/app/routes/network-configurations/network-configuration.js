import Route from '@ember/routing/route';
import Ember from 'ember';
export default Route.extend({
	model: function(parameters) {
		return Ember.RSVP.hash({
			networkConfiguration: this.store.findRecord('networkConfiguration', parameters.id),
			weightInitializations: this.store.findAll('weight-init'),
			activations: this.store.findAll('activation'),
			updaters: this.store.findAll('updater'), 
			optimizationAlgorithms: this.store.findAll('optimizationAlgorithm'),
			layersTable: {
				title: 'route.layer.title',
				link: 'layer-configurations.layer-configuration',
				columns: [
					{title: "route.common.name", property: "name"},
					{title: "route.common.id", property: "id"}
				]
			}
		});
	}
});
