import Route from '@ember/routing/route';
import Ember from 'ember';
export default Route.extend({
	model: function() {
		return Ember.RSVP.hash({
			networkConfigurations: this.store.findAll('networkConfiguration'),
			tableDefinition: {
				title: 'route.network.title',
				link: 'network-configurations.network-configuration',
				columns: [
					{title: "route.common.name", property: "name"},
					{title: "route.common.id", property: "id"}
				]
			}
		});
	}
});
