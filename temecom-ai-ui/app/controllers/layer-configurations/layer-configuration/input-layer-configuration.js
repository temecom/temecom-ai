import Controller from '@ember/controller';
import { inject as controller} from '@ember/controller';
export default Controller.extend({
	//layerConfiguration: controller('layer-configuration'),
	actions: {
		saveLayer: function() {
			this.get('model.layerConfiguration').save();
		}
	},
	setLayerConfiguration: function(layerConfiguration) {
		this.get('layerController').addLayerConfiguration(layerConfiguration);
	}
});
