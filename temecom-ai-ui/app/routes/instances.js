import Route from '@ember/routing/route';
import {hash as rsvpHash}  from 'rsvp';
export default Route.extend({
	model: function() {
		return rsvpHash ({
			instances: this.store.findAll('instance'),
			tableDefinition: {
				title: 'route.instance.title',
				columns: [
					{title: "route.common.name", property: "name"},
					{title: "route.common.id", property: "id"}
				]
			}
		});
	}
});
