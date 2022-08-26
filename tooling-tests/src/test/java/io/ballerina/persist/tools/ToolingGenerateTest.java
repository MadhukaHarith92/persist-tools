/*
 *  Copyright (c) 2022, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.ballerina.persist.tools;

import jdk.jfr.Description;
import org.testng.annotations.Test;

import static io.ballerina.persist.tools.ToolingTestUtils.Command.GENERATE;
import static io.ballerina.persist.tools.ToolingTestUtils.assertGeneratedSources;

/**
 * persist tool generate command tests.
 */
public class ToolingGenerateTest {

    @Test(enabled = false)
    @Description("There is only a single entity in the Ballerina project")
    public void testGenerateSingleEntity() {
        assertGeneratedSources("tool_test_generate_1", GENERATE);
    }

    @Test(enabled = false)
    @Description("There are multiple entities in the Ballerina project")
    public void testGenerateMultipleEntities() {
        assertGeneratedSources("tool_test_generate_2", GENERATE);
    }

    @Test(enabled = false)
    @Description("There are no entities nor already generated client objects in the Ballerina project")
    public void testGenerateWithoutEntitiesWithoutClients() {
        assertGeneratedSources("tool_test_generate_3", GENERATE);
    }

    @Test(enabled = false)
    @Description("There are no entities but there are already generated client objects in the Ballerina project")
    public void testGenerateWithoutEntitiesWithClients() {
        assertGeneratedSources("tool_test_generate_4", GENERATE);
    }

    @Test(enabled = false)
    @Description("When the generate command is executed outside a Ballerina project")
    public void testGenerateOutsideBalProject() {
        assertGeneratedSources("tool_test_generate_5", GENERATE);
    }

    @Test(enabled = false)
    @Description("There is a generated client object and the corresponding entity is updated")
    public void testGenerateUpdateEntity() {
        assertGeneratedSources("tool_test_generate_6", GENERATE);
    }

    @Test(enabled = false)
    @Description("There is a generated client object and the corresponding entity is removed")
    public void testGenerateRemoveEntity() {
        assertGeneratedSources("tool_test_generate_7", GENERATE);
    }

    @Test(enabled = false)
    @Description("A persist entity with all the supported fields data types")
    public void testGenerateAllEntityFieldTypes() {
        assertGeneratedSources("tool_test_generate_8", GENERATE);
    }
}
