import AIEntity from './ai-entity';
import DS from 'ember-data';
export default AIEntity.extend({
	numberOfOutputs: DS.attr('number')
});
