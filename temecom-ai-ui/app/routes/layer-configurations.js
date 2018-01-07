import Route from '@ember/routing/route';
import Ember from 'ember';
export default Route.extend({
	model: function() {
		return Ember.RSVP.hash({
			layerConfigurations: this.store.findAll('layerConfiguration'),
			instanceStatuses: this.store.findAll('instanceStatus'),
			tableDefinition: {
				title: "route.layer.title",
				link: "layer-configurations.layer-configuration",
				columns: [
					{title: "route.common.name", property: "name"},
					{title: "route.common.id", property: "id"}
				]
			}
		});
	}
});
