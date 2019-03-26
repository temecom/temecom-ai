import Route from '@ember/routing/route';
import {hash as rsvpHash, all as rsvpAll} from 'rsvp'; 
export default Route.extend({
	model: function() {
		var self = this; 
		return rsvpHash({
			layerConfigurations: 
				rsvpAll([
					this.store.findAll('denseLayerConfiguration'),
					this.store.findAll('inputLayerConfiguration'),
					this.store.findAll('outputLayerConfiguration')
				])
			.then(function(arrays){
				var mergedArray = Ember.A();
			      arrays.forEach(function (records) {
			        mergedArray.pushObjects(records.toArray());
			      });
			      return mergedArray;
			}),
			instanceStatuses: this.store.findAll('instanceStatus'),
			layerTypes: this.store.findAll('layerType'),
			tableDefinition: {
				title: "route.layer.title",
				link: "layer-configurations.layer-configuration.dense-layer-configuration",
				columns: [
					{title: "route.common.name", property: "name"},
					{title: "route.common.id", property: "id"}
				]
			}
		});
	}
});
