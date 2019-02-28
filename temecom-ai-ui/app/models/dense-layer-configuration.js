import LayerConfiguration from './layer-configuration';
import DS from 'ember-data';
export default LayerConfiguration.extend({
	numberOfHiddenNodes: DS.attr('number')
});
