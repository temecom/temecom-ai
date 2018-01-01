import Controller from '@ember/controller';

export default Controller.extend({
	actions: {
		newLayer: function() {
			var layer = this.store.createRecord('layerConfiguration',{name: "New Layer"});
			layer.save()
			.then(function(layer){
				this.transitionTo('layer-configurations.layer-configuration', layer);
			});
		}
	}
});
