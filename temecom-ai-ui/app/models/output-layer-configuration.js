import LayerConfiguration from './layer-configuration';
import DS from 'ember-data';
export default LayerConfiguration.extend({
	 lossFunction: DS.belongsTo('LossFunction')
});
