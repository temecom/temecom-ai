import AIEntity from './ai-entity';
import DS from 'ember-data';
export default AIEntity.extend({
	startTime: DS.attr( 'date'), 
	networkConfiguration: DS.belongsTo( 'NetworkConfiguration') ,
	status: DS.belongsTo( 'InstanceStatus')
});
