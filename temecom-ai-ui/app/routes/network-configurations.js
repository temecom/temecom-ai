import Route from '@ember/routing/route';
import {hash as rsvpHash}  from 'rsvp';
export default Route.extend({
	model: function() {
		return rsvpHash({
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
