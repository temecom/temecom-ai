import Route from '@ember/routing/route';
import Ember from 'ember';
export default Route.extend({
	model: function() {
		return Ember.RSVP.hash ({
			instances: this.store.findAll('instance')
		});
	}
});
