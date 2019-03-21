import Controller from '@ember/controller';
import { inject as controller} from '@ember/controller';
export default Controller.extend({
	actions: {
		saveLayer: function() {
			this.get('model.layerConfiguration').save();
		}
	}
});
