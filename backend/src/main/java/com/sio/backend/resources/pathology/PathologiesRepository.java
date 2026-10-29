package com.sio.backend.resources.pathology;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PathologiesRepository extends JpaRepository<Pathologies, String> {
}
