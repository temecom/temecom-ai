import Route from '@ember/routing/route';
import {hash as rsvpHash}  from 'rsvp';
export default Route.extend({
	model: function(parameter) {
		return rsvpHash ({
			instance: this.store.findRecord('instance', parameter.id),
			networkConfigurations: this.store.findAll('networkConfiguration'),
			instanceStatuses: this.store.findAll('instanceStatus')
		})
		.then(function(model){
			return model;
		});
	}
});
