import Route from '@ember/routing/route';
import {hash as rsvpHash}  from 'rsvp';
export default Route.extend({
	model: function(parameters) {
		return rsvpHash({
			networkConfiguration: this.store.findRecord('networkConfiguration', parameters.id),
			weightInitializations: this.store.findAll('weightInit'),
			activations: this.store.findAll('activation'),
			updaters: this.store.findAll('updater'), 
			optimizationAlgorithms: this.store.findAll('optimizationAlgorithm'),
			layers: this.store.findAll('layerConfiguration'),
			tableDefinition: {
				title: 'route.layer.title',
				link: 'layer-configurations.layer-configuration',
				columns: [
					{title: "route.common.name", property: "name"},
					{title: "route.common.id", property: "id"}
				]
			}
		})
		.then(function(model){
			return model;
		});
	}
});
