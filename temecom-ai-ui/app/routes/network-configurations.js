import Route from '@ember/routing/route';
import Ember from 'ember';
export default Route.extend({
	model: function() {
		return Ember.RSVP.hash({
			networkConfigurations: this.store.findAll('networkConfiguration'),
			title: 'route.network.title'
		});
	}
});
