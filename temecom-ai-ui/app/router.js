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
  this.route('instances', function() {
      this.route('instance', {path:':id'});    	
  });
  this.route('layer-configurations', function() {
      this.route('layer-configuration' ,function(){
    	  this.route('input-layer-configuration', {path:':id'});
      });	
  });
  this.route('layer-configurations');
  this.route('layer-configuration');
});

export default Router;
