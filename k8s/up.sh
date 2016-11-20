
# variables
APP=boot
#ENVIRONMENT=production
ENVIRONMENT=staging


# namespace
kubectl apply -f namespaces/$APP-$ENVIRONMENT.yaml

# nginx ingress controller
kubectl apply -f ingress/$ENVIRONMENT/nginx/configmap.yaml
kubectl apply -f ingress/$ENVIRONMENT/nginx/default-service.yaml
kubectl apply -f ingress/$ENVIRONMENT/nginx/default-deployment.yaml
kubectl apply -f ingress/$ENVIRONMENT/nginx/service.yaml
kubectl apply -f ingress/$ENVIRONMENT/nginx/deployment.yaml

# service
kubectl apply -f services/$APP.yaml --namespace $APP-$ENVIRONMENT

# deployment
kubectl apply -f deployments/$APP.yaml --namespace $APP-$ENVIRONMENT

# ingress
kubectl apply -f ingress/$ENVIRONMENT/$APP-$ENVIRONMENT.yaml

