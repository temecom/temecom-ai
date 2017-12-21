import { moduleForModel, test } from 'ember-qunit';

moduleForModel('neural-network-layer', 'Unit | Model | neural network layer', {
  // Specify the other units that are required for this test.
  needs: []
});

test('it exists', function(assert) {
  let model = this.subject();
  // let store = this.store();
  assert.ok(!!model);
});
