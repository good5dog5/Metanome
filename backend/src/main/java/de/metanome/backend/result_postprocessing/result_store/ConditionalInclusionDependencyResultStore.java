/**
 * Copyright 2015-2016 by Metanome Project
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
package de.metanome.backend.result_postprocessing.result_store;

import de.metanome.backend.result_postprocessing.result_comparator.ConditionalInclusionDependencyResultComparator;
import de.metanome.backend.result_postprocessing.result_comparator.ResultComparator;
import de.metanome.backend.result_postprocessing.results.ConditionalInclusionDependencyResult;

/**
 * Stores Conditional Inclusion Dependency results of one execution.
 */
public class ConditionalInclusionDependencyResultStore extends ResultsStore<ConditionalInclusionDependencyResult> {

  /**
   * Defines an Conditional Inclusion Dependency result comparator
   *
   * @param sortProperty Sort property
   * @param ascending    Sort direction
   * @return Returns a new Conditional Inclusion Dependency result comparator
   */
    @Override
    protected ResultComparator<ConditionalInclusionDependencyResult> getResultComparator(String sortProperty, boolean ascending) {
        return new ConditionalInclusionDependencyResultComparator(sortProperty, ascending);
    }
}
