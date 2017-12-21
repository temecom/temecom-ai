import EmberRouter from '@ember/routing/router';
import config from './config/environment';

const Router = EmberRouter.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('network-configurations', function() {
        this.route('network-configuration', {path:':id'});    	
    });
  this.route('dashboard');
});

export default Router;
