import LayerConfiguration from '../layer-configuration';
export default LayerConfiguration.extend({
	actions: {
		
		lossFunctionSelected: function(lossFunction) {
			this.set('model.layerConfiguration.lossFunction', lossFunction);
		}
	}
});
