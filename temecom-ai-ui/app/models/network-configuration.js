import AIEntity from './ai-entity';
import DS from 'ember-data';
export default AIEntity.extend({
	iterations : DS.attr('number'),
	weightInit : DS.belongsTo('WeightInit'),
	activation : DS.belongsTo('Activation'),
	optimizationAlgorithm : DS.belongsTo('OptimizationAlgorithm'),
	learningRate : DS.attr('number'),
	backprop : DS.attr('boolean'),
	seed : DS.attr('number'),
	updater : DS.belongsTo('Updater'), 
	layers: DS.hasMany('LayerConfiguration')
});