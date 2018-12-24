# GimoHub

This is a project consisting learning materials for Docker and Kubernetes.
Docker is one of the most popular Packaging tool use widely. Kubernetes is the latest and developed by Google.

Before going deep lets learn the basics of Docker first.
Docker is a platform for developers and system admins to develop, deploy and run applications with in containers. Before going deep lets discuss basic docker concepts. Note that we are using Docker Community Edition(CE) for this Project.

An Image is an executable package that includes everything needed to run an application - the code, a run-time, libraries, environment variables, and configuration files. The container is a run-time instance of an image. Means image becomes a memory when it is executed.

The use of Linux containers to deploy applications is called as containerization.Why use containers over VMs ? Well this is an open ended question. Both have pros and cons depends on user perspective. However containers are lightweight(share host kernel),portable(can build locally deploy to cloud and use anywhere),Scalable(can increase and automatically distribute container replicas),flexible(more complex apps can also be containerized) and stackable(stack services vertically).