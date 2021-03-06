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
      this.route('layer-configuration',{path:'/:id'},function(){
    	  this.route('output-layer-configuration',{path:'/output-layer-configuration/:id'});
    	  this.route('input-layer-configuration',{path:'/input-layer-configuration/:id'});
    	  this.route('dense-layer-configuration',{path:'/dense-layer-configuration/:id'});
      });	
  });
  this.route('layer-configurations');
});

export default Router;
