import Route from '@ember/routing/route';
import Ember from 'ember';
export default Route.extend({
    intl: Ember.inject.service(),
	beforeModel() {
		      return this.get('intl').setLocale(['en-us']);
	},
	model: function() {
		return {
			user: {givenName: "Admin", surName: "User"}, 
			title: "Dashboard", 
			networkConfigurations: this.store.findAll('networkConfiguration')
		};
	}
});
