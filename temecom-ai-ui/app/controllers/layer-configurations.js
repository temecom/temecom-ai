import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
		newLayer: function(layerType) {
			var self = this; 
			var localClassPackageAndName = layerType.get('className').split('.');
			var localClass = localClassPackageAndName.get('lastObject');
			var layer = this.store.createRecord(localClass,{name: "New " + layerType.get('name') + " Layer"});
			layer.save()
			.then(function(layer){
				self.transitionToRoute('layer-configurations.layer-configuration', layer);
			});
		}, 
		layerSelected: function(layer) {
			switch(layer.get('className')) {
			case "InputLayerConfiguration":
				this.transitionToRoute('layer-configurations.layer-configuration.input-layer-configuration', layer);
				break;
			case "OutputLayerConfiguration":
				this.transitionToRoute('layer-configurations.layer-configuration.input-layer-configuration', layer);
				break;
			case "DenseLayerConfiguration":
				this.transitionToRoute('layer-configurations.layer-configuration.dense-layer-configuration', layer);
				break;
			}
		}
	}
});
