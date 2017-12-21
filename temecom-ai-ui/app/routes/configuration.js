import Route from '@ember/routing/route';
import Ember from 'ember';
export default Route.extend({
	application: Ember.inject.controller(),
	model: function (){
		return Ember.RSVP.hash({
			configurations: this.store.findAll("NetworkConfiguration"), 
			title: 'route.configuration'
		});
	}
});
