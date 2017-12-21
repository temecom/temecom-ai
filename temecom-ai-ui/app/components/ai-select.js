import Component from '@ember/component';
import Ember from 'ember';

export default Component.extend({
	actions: {
		setSelection: function(value) {
			this.sendAction('selected', value);
		}
	}
});
