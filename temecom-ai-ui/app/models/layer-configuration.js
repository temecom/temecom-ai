import AIEntity from './ai-entity';
import DS from 'ember-data';
export default AIEntity.extend({
  numberOfInputs:  DS.attr( 'number') ,
  numberOfOutputs:  DS.attr( 'number') ,
  weightInitialization:  DS.belongsTo( 'WeightInit') ,
  activation:  DS.belongsTo( 'Activation') 
});
