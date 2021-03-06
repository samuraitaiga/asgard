/*
 * Copyright 2013 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.asgard.deployment

import com.netflix.asgard.UserContext
import com.netflix.asgard.flow.WorkflowDescriptionTemplate

/**
 * Constructs the description for a specific deployment workflow execution.
 */
class DeploymentWorkflowDescriptionTemplate extends WorkflowDescriptionTemplate implements DeploymentWorkflow {

    @Override
    void deploy(UserContext userContext, DeploymentWorkflowOptions deploymentOptions,
                LaunchConfigurationOptions lcOverrides, AutoScalingGroupOptions asgOverrides) {
        description = "Deploying new ASG to cluster '${deploymentOptions.clusterName}'"
    }
}
