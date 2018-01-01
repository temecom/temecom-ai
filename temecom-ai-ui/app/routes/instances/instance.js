import Route from '@ember/routing/route';
import Ember from 'ember';
export default Route.extend({
	model: function(parameter) {
		return Ember.RSVP.hash ({
			instance: this.store.findRecord('instance', parameter.id),
			networkConfigurations: this.store.findAll('networkConfiguration'),
			instanceStatuses: this.store.findAll('instanceStatus'),
			tableDefinition: {
				title: "route.common.title",
				columns: [
					{title: "route.common.name", property: "name"},
					{title: "route.common.id", property: "id"}
				]
			}
		});
	}
});
